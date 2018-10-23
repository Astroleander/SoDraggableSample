package bupt.astroleander.sodraggable;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;

/**
 * <h1> ${className} </h1>
 * <p>Created by Astroleander on 2018/10/23<p>.
 * <p>
 * <p>
 *
 * @author Astroleander
 * @version 1.0.0
 * <p>Observable dataset used in MainActivity</p>
 *
 */
public class RGBViewModel extends BaseObservable {
    public final ObservableInt red = new ObservableInt();
    public final ObservableInt green = new ObservableInt();
    public final ObservableInt blue = new ObservableInt();
}
