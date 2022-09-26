/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
