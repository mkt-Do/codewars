use std::collections::HashSet;

#[allow(dead_code)]
fn trotter(n: i32)-> i32 {
    let digits: HashSet<i32> = (0..10).collect::<HashSet<i32>>();
    fn rec(n: i32, i: i32, cur: HashSet<i32>, digits: HashSet<i32>) -> i32 {
        if i <= 0 || n <= 0 { -1 }
        else {
            let val = n * i;
            let val_digits = val.to_string()
                .chars()
                .map(|c| c.to_string().parse().unwrap())
                .collect::<HashSet<i32>>();
            let new_set: HashSet<_> = cur.union(&val_digits).map(|&x| x).collect();
            if digits.iter().filter(|x| new_set.contains(&x)).count() == digits.len() { val }
            else { rec(n, i + 1, new_set, digits) }
        }
    }
    rec(n, 1, HashSet::new(), digits)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn returns_expected() {
        assert_eq!(trotter(1692), 5076);
        assert_eq!(trotter(2), 90);
        assert_eq!(trotter(7), 70);
    }
}