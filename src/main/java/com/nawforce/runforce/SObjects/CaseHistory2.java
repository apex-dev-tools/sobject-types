/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CaseHistory2 extends SObject {
	public static SObjectType$<CaseHistory2> SObjectType;
	public static SObjectFields$<CaseHistory2> Fields;

	public Id CaseId;
	public Case Case;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public Name Owner;
	public Datetime PreviousUpdate;
	public String Status;
	public Datetime SystemModstamp;

	public CaseHistory2 clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2 clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2 clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
