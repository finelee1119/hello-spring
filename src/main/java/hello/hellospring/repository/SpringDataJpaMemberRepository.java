package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpringDataJpaMemberRepository extends JpaMemberRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
