#[allow(dead_code)]
fn word_mesh(arr: &[&str]) -> Option<String> {
    let (_, copied_arr) = arr.clone().split_at(1);
    let meshed_arr: Vec<Option<String>> = arr.iter().zip(copied_arr)
        .map(|(&left, &right)| extract_meshed_word(left, right))
        .collect();
    let original_length = meshed_arr.len();
    let flatten_meshed_arr: Vec<String> = meshed_arr.into_iter().flatten().collect();
    if original_length == flatten_meshed_arr.len() {
        Some(flatten_meshed_arr.join(""))
    } else {
        None
    }
}

fn extract_meshed_word(left: &str, right: &str) -> Option<String> {
    if left.is_empty() || right.is_empty() {
        None
    } else if right.starts_with(left) {
        Some(left.to_string())
    } else {
        extract_meshed_word(&left[1..], right)
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn basic() {
        assert_eq!(
            word_mesh(&["beacon", "condominium", "umbilical", "california"]).as_deref(),
            Some("conumcal"),
        );
        assert_eq!(
            word_mesh(&["allow", "lowering", "ringmaster", "terror"]).as_deref(),
            Some("lowringter"),
        );
        assert_eq!(
            word_mesh(&["abandon", "donation", "onion", "ongoing"]).as_deref(),
            Some("dononon"),
        );
        assert_eq!(
            word_mesh(&["jamestown", "ownership", "hippocampus", "pushcart", "cartographer", "pheromone"]).as_deref(),
            Some("ownhippuscartpher"),
        );
    }
}