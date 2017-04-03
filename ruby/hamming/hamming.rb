class Hamming

  def self.compute(string_1, string_2)

    if string_1.length != string_2.length
      raise(ArgumentError)
      return
    end

    differences_counter = 0
    index_counter = 0

    while index_counter < string_1.length
      if string_1[index_counter] != string_2[index_counter]
      differences_counter +=1
      end
      index_counter +=1
    end


    return differences_counter

  end

end