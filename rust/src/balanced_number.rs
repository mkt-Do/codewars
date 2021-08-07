#[allow(dead_code)]
fn balanced_num(n: u64) -> String {
    let numstr = n.to_string();
    if numstr.len() % 2 == 0 {
        let (left, right) = (&numstr[0..(numstr.len() / 2 - 1)], &numstr[(numstr.len() / 2 + 1)..numstr.len()]);
        if is_same_two_num_vec(convert_each_chars_to_num(left), convert_each_chars_to_num(right)) {
            "Balanced".to_string()
        } else {
            "Not Balanced".to_string()
        }
    } else {
        let (left, right) = (&numstr[0..(numstr.len() / 2)], &numstr[((numstr.len() / 2 + 1)..numstr.len())]);
        if is_same_two_num_vec(convert_each_chars_to_num(left), convert_each_chars_to_num(right)) {
            "Balanced".to_string()
        } else {
            "Not Balanced".to_string()
        }
    }
}

fn convert_each_chars_to_num(str: &str) -> Vec<i32> {
    str.chars().map(|c| c as i32 - 48).collect()
}

fn is_same_two_num_vec(left: Vec<i32>, right: Vec<i32>) -> bool {
    left.iter().sum::<i32>() == right.iter().sum::<i32>()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn balanced_number() {
        assert_eq!(balanced_num(7), "Balanced");
        assert_eq!(balanced_num(959), "Balanced");
        assert_eq!(balanced_num(13), "Balanced");
        assert_eq!(balanced_num(432), "Not Balanced");
        assert_eq!(balanced_num(424), "Balanced");
    }

    #[test]
    fn larger_number() {
        assert_eq!(balanced_num(1024), "Not Balanced");
        assert_eq!(balanced_num(66545), "Not Balanced");
        assert_eq!(balanced_num(295591), "Not Balanced");
        assert_eq!(balanced_num(1230987), "Not Balanced");
        assert_eq!(balanced_num(56239814), "Balanced");
    }
}