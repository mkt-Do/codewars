#[allow(dead_code)]
fn round_to_next_5(n: i32) -> i32 {
    if n % 5 == 0 {
        n
    } else if n > 0 {
        5 * (n / 5 + 1)
    } else {
        5 * (n / 5)
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic() {
        assert_eq!(round_to_next_5(1), 5);
    }
    #[test]
    fn test_basic_neg() {
        assert_eq!(round_to_next_5(-1), 0);
    }
    #[test]
    fn test_extended() {
        let tests = [[0,0],[1,5],[-1,0],[-5,-5],[3,5],[5,5],[7,10],[20,20],[39,40],[990,990],[121,125],[555,555]];
        for [x, out] in tests.iter() {
            assert_eq!(round_to_next_5(*x), *out);
        }
    }
}
