class HowManyNumbers3
  def find_all(n, k)
    res = (1..9).to_a.repeated_combination(k)
      .select { |arr| arr.sum == n }
      .map { |arr| arr.map(&:to_s).join.to_i }
    if res.empty?
      []
    else
      [res.size, res.min, res.max]
    end
  end
end
