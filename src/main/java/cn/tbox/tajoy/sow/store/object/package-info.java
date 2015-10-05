/**
 * <h1>package-info.java</h1><br>
 * Tajoy Create on 2015年9月26日 下午6:57:27
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */
/**
 * <h1>package-info</h1><br>
 * This package contains all object used in {@link cn.tbox.tajoy.sow.store}.
 * All object is stored in a specify
 * {@link cn.tbox.tajoy.sow.driver.StoreDriver.Interface}.
 * The object classified into two groups: <br/>
 * 1. {@link DataObject}: this is data object, that is contains all readable
 * data of all type. <br>
 * 2. {@link SturctObject}: this is structure object, that is not contains any
 * readable data, but it store some constructive information to structure other
 * object. <br>
 * All object is extends from {@link BaseObject}, and it defined all common
 * features and method in object.
 * <br>
 * <br>
 * 本包包含所有的用于{@link cn.tbox.tajoy.sow.store}的对象.
 * 所有对象储存于指定的{@link cn.tbox.tajoy.sow.driver.StoreDriver.Interface}中.
 * 对象分为三个种类: <br>
 * 1. {@link DataObject}: 数据对象, 它包含所有类型的可读取的数据. <br>
 * 2. {@link SturctObject}: 结构对象, 它不包含任何可读的数据, 但是它储存有一
 * 些结构信息, 用于组装其他对象. <br>
 * 所有的对象都继承自{@link BaseObject}, 它定义了所有对象通用的特性和方法.
 * 
 * @author Tajoy
 * @see cn.tbox.tajoy.sow.driver.StoreDriver
 * @see cn.tbox.tajoy.sow.driver.StoreDriver.Interface
 * @see cn.tbox.tajoy.sow.store
 *
 */


package cn.tbox.tajoy.sow.store.object;
