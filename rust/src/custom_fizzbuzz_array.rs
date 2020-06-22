#[allow(dead_code)]
fn fizz_buzz_custom_solver(string_one: &str, string_two: &str, num_one: usize, num_two: usize) -> Vec<String> {
    (1..=100).map(|n| if n % num_one == 0 && n % num_two == 0 {
        string_one.to_string() + string_two
    } else if n % num_one == 0 {
        string_one.to_string()
    } else if n % num_two == 0 {
        string_two.to_string()
    } else {
        n.to_string()
    }).collect::<Vec<String>>()
}

#[macro_export]
macro_rules! fizz_buzz_custom {
    () => { fizz_buzz_custom_solver("Fizz", "Buzz", 3, 5) };
    ($str_one:expr) => { fizz_buzz_custom_solver($str_one, "Buzz", 3, 5) };
    ($str_one:expr, $str_two:expr) => { fizz_buzz_custom_solver($str_one, $str_two, 3, 5) };
    ($str_one:expr, $str_two:expr, $num_one:expr) => { fizz_buzz_custom_solver($str_one, $str_two, $num_one, 5) };
    ($str_one:expr, $str_two:expr, $num_one:expr, $num_two:expr) => { fizz_buzz_custom_solver($str_one, $str_two, $num_one, $num_two) };
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic() {
        assert_eq!(fizz_buzz_custom!()[3], "4".to_string());
        assert_eq!(fizz_buzz_custom!()[15], "16".to_string());
    }
}

