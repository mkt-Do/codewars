package codewars

func ContainAllRots(strng string, arr []string) bool {
	strRots := []string{}
	for i := 0; i < len(strng); i++ {
		head := strng[:i]
		tail := strng[i:]
		strRots = append(strRots, tail+head)
	}

	for _, str := range strRots {
		if !contains(str, arr) {
			return false
		}
	}
	return true
}

func contains(str string, arr []string) bool {
	for _, elem := range arr {
		if elem == str {
			return true
		}
	}
	return false
}
