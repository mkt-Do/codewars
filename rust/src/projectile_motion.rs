use std::f64::consts::PI;
use regex::Regex;

#[allow(dead_code)]
struct Projectile {
    height: u64,
    velocity: u64,
    angle: u64,
    vertical_velocity: f64,
    horizontal_velocity: f64,
}

#[allow(dead_code)]
impl Projectile {
    fn new(height: u64, velocity: u64, angle: u64) -> Self {
        Projectile {
            height,
            velocity,
            angle,
            vertical_velocity: (velocity as f64) * (angle as f64 / 360.0 * 2.0 * PI).sin(),
            horizontal_velocity: (velocity as f64) * (angle as f64 / 360.0 * 2.0 * PI).cos(),
        }
    }

    fn height_eq(&self) -> String {
        let v = (self.vertical_velocity * 1000.0).round() / 1000.0;
        let fract_digits = Regex::new(r"^\d+\.").unwrap().replace(&(v.to_string()), "").len();
        match self.height {
            0 => format!("h(t) = -16.0t^2 + {0:.1$}t", v, fract_digits),
            _ => format!("h(t) = -16.0t^2 + {0:.1$}t + {2:.1}", v, fract_digits, self.height as f64),
        }
    }

    fn horiz_eq(&self) -> String {
        let v = (self.horizontal_velocity * 1000.0).round() / 1000.0;
        let fract_digits = Regex::new(r"^\d+\.").unwrap().replace(&(v.to_string()), "").len();
        format!("x(t) = {0:.1$}t", v, fract_digits)
    }

    fn height(&self, t: f64) -> f64 {
        ((- 16.0 * t.powi(2) + self.vertical_velocity * t + (self.height as f64)) * 1000.0).round() / 1000.0
    }

    fn horiz(&self, t: f64) -> f64 {
        ((self.horizontal_velocity * t) * 1000.0).round() / 1000.0
    }

    fn landing(&self) -> [f64; 3] {
        let t = (-self.vertical_velocity - (self.vertical_velocity.powi(2) - 4.0 * (-16.0) * (self.height as f64)).sqrt()) / (2.0 * (-16.0));
        [(self.horiz(t) * 1000.0).round() / 1000.0, 0.0, (t * 1000.0).round() / 1000.0]
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn example() {
        let p = Projectile::new(5, 2, 45);

        assert_eq!(p.height_eq(), "h(t) = -16.0t^2 + 1.414t + 5.0");
        assert_eq!(p.horiz_eq(), "x(t) = 1.414t");
        assert_eq!(p.height(0.2), 4.643);
        assert_eq!(p.horiz(0.2), 0.283);
        assert_eq!(p.landing(), [0.856, 0.0, 0.605]);
    }

    #[test]
    fn zero_height() {
        let p = Projectile::new(0, 5, 45);

        assert_eq!(p.height_eq(), "h(t) = -16.0t^2 + 3.536t");
        assert_eq!(p.horiz_eq(), "x(t) = 3.536t");
        assert_eq!(p.height(0.2), 0.067);
        assert_eq!(p.horiz(0.2), 0.707);
        assert_eq!(p.landing(), [0.781, 0.0, 0.221]);
    }

    #[test]
    fn another_example() {
        let p = Projectile::new(15, 12, 80);

        assert_eq!(p.height_eq(), "h(t) = -16.0t^2 + 11.818t + 15.0");
        assert_eq!(p.horiz_eq(), "x(t) = 2.084t");
        assert_eq!(p.height(0.0), 15.0);
        assert_eq!(p.horiz(0.0), 0.0);
        assert_eq!(p.height(1.0), 10.818);
        assert_eq!(p.horiz(1.0), 2.084);
        assert_eq!(p.landing(), [2.929, 0.0, 1.406]);
    }
}