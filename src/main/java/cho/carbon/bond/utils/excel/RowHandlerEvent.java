package cho.carbon.bond.utils.excel;

public interface RowHandlerEvent {
	boolean isBreak();

	void setTotalProgress(int var1);

	void setCurrentProgress(int var1);
}