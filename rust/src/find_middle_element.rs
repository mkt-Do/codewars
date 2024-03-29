#[allow(dead_code)]
fn gimme(input_array: [i32;3]) -> usize {
    let max = input_array.iter().max().unwrap();
    let min = input_array.iter().min().unwrap();
    input_array.iter().position(|v| v > min && v < max).unwrap()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_gimme() {
        assert_eq!(gimme([2, 3, 1]), 0);
        assert_eq!(gimme([-2, -3, -1]), 0);
        assert_eq!(gimme([5, 10, 14]), 1);
    }
}