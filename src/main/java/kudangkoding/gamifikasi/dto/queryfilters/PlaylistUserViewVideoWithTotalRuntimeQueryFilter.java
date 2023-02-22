package kudangkoding.gamifikasi.dto.queryfilters;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class PlaylistUserViewVideoWithTotalRuntimeQueryFilter extends BaseQueryFilter {

    private String user_id;

    private String playlist_id;

    private String playlist_video_id;

    private Integer runtime_persecond;

}
