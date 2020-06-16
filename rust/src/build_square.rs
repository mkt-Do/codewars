#[allow(dead_code)]
fn generate_shape(n: i32) -> String {
    let n: usize = n as usize;
    ("+".repeat(n) + "\n").repeat(n).trim().to_string()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn sample_test() {
        assert_eq!(generate_shape(3), "+++\n+++\n+++");
    }
}
