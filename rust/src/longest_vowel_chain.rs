use regex::Regex;

#[allow(dead_code)]
fn longest_vowel_chain(s: &str) -> usize {
    let regex = Regex::new(r"[^aeiou]").unwrap();
    regex.split(&s)
        .map(|chunk| chunk.len())
        .max()
        .unwrap()
}

#[cfg(test)]
mod tests {
    use super::longest_vowel_chain;
    
    #[test]
    fn basic_tests() {
        assert_eq!(longest_vowel_chain("codewarriors"), 2);
        assert_eq!(longest_vowel_chain("suoidea"), 3);
        assert_eq!(longest_vowel_chain("ultrarevolutionariees"), 3);
        assert_eq!(longest_vowel_chain("strengthlessnesses"), 1);
        assert_eq!(longest_vowel_chain("cuboideonavicuare"), 2);
        assert_eq!(longest_vowel_chain("chrononhotonthuooaos"), 5);
        assert_eq!(longest_vowel_chain("iiihoovaeaaaoougjyaw"), 8);
    }
}