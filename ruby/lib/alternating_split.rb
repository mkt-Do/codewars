class AlternatingSplit
  def encrypt(text, n)
    if n <= 0
      text
    else
      new_text = text.chars.each_slice(2).map { |arr| if arr.size != 2
        arr + [""]
      else
        arr
      end }.transpose.reverse.flatten.join
      encrypt(new_text, n - 1)
    end
  end

  def decrypt(encrypted_text, n)
    if n <= 0
      encrypted_text
    else
      new_text_arr = encrypted_text.chars.each_slice(encrypted_text.size / 2).map { |arr| arr }
      if new_text_arr.size > 2
        ta = new_text_arr[0..1].reverse.transpose.flatten.join
        rm = new_text_arr[2].join
        decrypt(ta + rm, n - 1)
      else
        decrypt(new_text_arr.reverse.transpose.flatten.join, n - 1)
      end
    end
  end
end
