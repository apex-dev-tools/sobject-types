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
public class IndividualHistory extends SObject {
	public static SObjectType$<IndividualHistory> SObjectType;
	public static SObjectFields$<IndividualHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Field;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public IndividualHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public IndividualHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IndividualHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IndividualHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IndividualHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}