import com.spring.model.Book;
import com.spring.model.Genre;
import com.spring.repository.BookRepository;
import com.spring.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GenreService {
    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public void save(Genre genre) {
        genreRepository.save(genre);
    }

    public List<Genre> listAll() {
        return genreRepository.findAll();
    }

    public Genre get(int id) {
        return genreRepository.findById(id).get();
    }

    public void delete(int id) {
        genreRepository.deleteById(id);
    }
}

