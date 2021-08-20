#[allow(dead_code)]
fn bingo<S: AsRef<str>>(ticket: &[(S, u8)], win: usize) -> &'static str {
    if ticket.into_iter()
        .filter(|&(s, v)| (s.as_ref()).chars().collect::<Vec<char>>().contains(&(*v as char)))
        .count() >= win
    {
        "Winner!"
    } else {
        "Loser!"
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn basic() {
        assert_eq!(bingo(&[("ABC", 65), ("HGR", 74), ("BYHT", 74)], 2), "Loser!");
        assert_eq!(bingo(&[("ABC", 65), ("HGR", 74), ("BYHT", 74)], 1), "Winner!");
        assert_eq!(bingo(&[("HGTYRE", 74), ("BE", 66), ("JKTY", 74)], 3), "Loser!");
    }
}