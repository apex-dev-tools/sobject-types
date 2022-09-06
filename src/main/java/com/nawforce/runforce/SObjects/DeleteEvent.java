/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DeleteEvent extends SObject {
	public static SObjectType$<DeleteEvent> SObjectType;
	public static SObjectFields$<DeleteEvent> Fields;

	public Id DeletedById;
	public User DeletedBy;
	public Datetime DeletedDate;
	public Id Id;
	public String Record;
	public String RecordName;
	public String SobjectName;
	public Datetime SystemModstamp;

	public DeleteEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DeleteEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DeleteEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DeleteEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DeleteEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
