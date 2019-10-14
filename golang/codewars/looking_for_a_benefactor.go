package codewars

func NewAvg(arr []float64, navg float64) int64 {
	res := int64(navg)*int64(len(arr)+1) - int64(Sum(arr))
	if res <= 0 {
		return -1
	}
	return res
}

func Sum(arr []float64) float64 {
	sum := 0.0
	for _, e := range arr {
		sum += e
	}
	return sum
}
