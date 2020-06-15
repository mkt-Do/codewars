#[allow(dead_code)]
fn high_and_low(numbers: &str) -> String {
    let mut nums: Vec<i32> = numbers.split_whitespace().map(|c| c.parse().unwrap()).collect::<Vec<i32>>();
    nums.sort();
    let max = nums.last().unwrap();
    let min = nums.first().unwrap();
    format!("{} {}", max.to_string(), min.to_string())
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn works() {
        assert_eq!("42 -9", high_and_low("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
