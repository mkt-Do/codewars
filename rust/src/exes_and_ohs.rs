#[allow(dead_code)]
fn xo(string: &'static str) -> bool {
    let (x, o): (Vec<char>, Vec<char>) = string.chars()
                 .filter(|&c| c.to_lowercase().to_string() == "x" || c.to_lowercase().to_string() == "o")
                 .partition(|&c| c.to_lowercase().to_string() == "x");
    x.len() == o.len()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn returns_expected() {
      assert_eq!(xo("xo"), true);
      assert_eq!(xo("Xo"), true);
      assert_eq!(xo("xxOo"), true);
      assert_eq!(xo("xxxm"), false);
      assert_eq!(xo("Oo"), false);
      assert_eq!(xo("ooom"), false);
    }
}
