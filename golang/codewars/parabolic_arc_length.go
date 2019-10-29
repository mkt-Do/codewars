package codewars

import "math"

func LenCurve(n int) float64 {
	res := 0.0
	prevX, prevY := 0.0, 0.0
	diffX := float64(1) / float64(n)
	for i := 1; i <= n; i++ {
		x := prevX + diffX
		y := x * x
		diffY := y - prevY
		res += math.Sqrt(diffX*diffX + diffY*diffY)
		prevX, prevY = x, y
	}
	return res
}
