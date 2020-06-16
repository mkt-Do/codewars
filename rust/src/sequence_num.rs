#[allow(dead_code)]
fn sum_of_n(n: i32) -> Vec<i32> {
    let nums: Vec<i32> = if n > 0 {
        (0..=n).collect()
    } else {
        (0..=(n * (-1))).map(|x| x * (-1)).collect()
    };
    fn rec(ns: Vec<i32>, res: Vec<i32>) -> Vec<i32> {
        if ns.is_empty() {
            res
        } else if res.is_empty() {
            rec((&ns[1..]).to_vec(), vec![ns[0]])
        } else {
            let mut prev = res.clone();
            prev.push(prev.last().unwrap() + ns[0]);
            rec((&ns[1..]).to_vec(), prev)
        }
    }
    rec(nums, vec![])
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn normal_tests() {
        assert_eq!(sum_of_n(3), vec![0, 1, 3, 6]);
        assert_eq!(sum_of_n(-4), vec![0, -1, -3, -6, -10]);
        assert_eq!(sum_of_n(1), vec![0, 1]);
        assert_eq!(sum_of_n(0), vec![0]);
        assert_eq!(sum_of_n(10), vec![0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55]);
    }
}
