# Given a DNA strand, its transcribed RNA strand is formed by replacing
# each nucleotide with its complement:

# * `G` -> `C`
# * `C` -> `G`
# * `T` -> `A`
# * `A` -> `U`


class Complement

  def self.of_dna(string)

    letters = string.scan /\w/

    rna_strand = []


    for letter in letters
      case letter
      when "C"
        rna_strand << "G"
      when "T"
        rna_strand << "A"
      when "A"
        rna_strand << "U"
      when "G"
        rna_strand << "C"
      else
        return ""
      end
    end

      return rna_strand.join

  end

end


module BookKeeping
    VERSION = 4
  end