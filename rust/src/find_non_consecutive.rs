#[allow(dead_code)]
fn first_non_consecutive(arr: &Vec<i32>) -> Option<i32> {
    if arr.is_empty() || arr.len() == 1 {
        None
    } else {
        let fst = arr[0];
        let snd = arr[1];
        if fst + 1 == snd {
            first_non_consecutive(&(arr[1..].to_vec()))
        } else {
            Some(snd)
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic() {
        assert_eq!(first_non_consecutive(&vec![1,2,3,4,6,7,8]), Some(6));
        assert_eq!(first_non_consecutive(&vec![1,2,3,4,5,6,7,8]), None);
        assert_eq!(first_non_consecutive(&vec![4,6,7,8,9,11]), Some(6));
        assert_eq!(first_non_consecutive(&vec![4,5,6,7,8,9,11]), Some(11));
        assert_eq!(first_non_consecutive(&vec![31,32]), None);
        assert_eq!(first_non_consecutive(&vec![-3,-2,0,1]), Some(0));
        assert_eq!(first_non_consecutive(&vec![-5,-4,-3,-1]), Some(-1));
    }
}
