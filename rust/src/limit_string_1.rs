#[allow(dead_code)]
fn solution(st: &str, limit: usize) -> String {
    if st.len() <= limit {
        format!("{}", st)
    } else {
        format!("{}{}", &st[0..limit], "...")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_add() {
        assert_eq!(solution("Testing String",3), "Tes...");
        assert_eq!(solution("Testing String",8), "Testing ...");
        assert_eq!(solution("Test", 10), "Test");
        assert_eq!(solution("Test", 4), "Test");
    }
}