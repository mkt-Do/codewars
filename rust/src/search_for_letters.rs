#[allow(dead_code)]
fn change(string: &str) -> String {
    let s = string.chars().filter_map(|c| if c.is_alphabetic() {
        Some(c.to_lowercase().to_string())
    } else {
        None
    }).collect::<String>();
    (b'a'..=b'z').map(|c| if s.contains(c as char) {
        49 as char
    } else {
        48 as char
    }).collect::<String>()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic() {
        assert_eq!(change("a **&  bZ"), "11000000000000000000000001");
    }
}
