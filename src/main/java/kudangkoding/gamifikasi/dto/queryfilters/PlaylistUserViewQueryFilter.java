package kudangkoding.gamifikasi.dto.queryfilters;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class PlaylistUserViewQueryFilter extends BaseQueryFilter {

    private String user_id;

    private String playlist_id;

}
