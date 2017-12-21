
package edu.ucla.library.iiif.manifestor;

import java.nio.charset.Charset;

public interface Constants {

    public static final String UTF_8_ENCODING = Charset.forName("UTF-8").name();

    public static final String MESSAGES = "iiif-manifestor_messages";

    /* The following are properties that can be set by the user */
    
    public static final String LOG_LEVEL_PROP = "iiif-manifestor.log.level";

    public static final String DATA_DIR_PROP = "iiif-manifestor.data.dir";

    public static final String UPLOADS_DIR_PROP = "iiif-manifestor.uploads.dir";

    public static final String WATCH_FOLDER_PROP = "iiif-manifestor.watch.folder";

    public static final String ID_PREFIXES_PROP = "iiif-manifestor.id.prefixes";

    public static final String TILE_SIZE_PROP = "iiif-manifestor.tile.size";

    public static final String THUMBNAIL_SIZE_PROP = "iiif-manifestor.thumbnail.size";

    /* Message values */

    public static final String SUCCESS_RESPONSE = "success";

    public static final String FAILURE_RESPONSE = "failure";

}
