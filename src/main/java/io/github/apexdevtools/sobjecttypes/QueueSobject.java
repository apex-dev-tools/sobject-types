/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class QueueSobject extends SObject {
	public static SObjectFields$<QueueSobject> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Id Id;
	public Id QueueId;
	public Group Queue;
	public String SobjectType;
	public Datetime SystemModstamp;

	public QueueSobject clone$() {throw new java.lang.UnsupportedOperationException();}
	public QueueSobject clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public QueueSobject clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public QueueSobject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public QueueSobject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
