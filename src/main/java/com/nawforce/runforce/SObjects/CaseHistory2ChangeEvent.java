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
public class CaseHistory2ChangeEvent extends SObject {
	public static SObjectType$<CaseHistory2ChangeEvent> SObjectType;
	public static SObjectFields$<CaseHistory2ChangeEvent> Fields;

	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Datetime PreviousUpdate;
	public String ReplayId;
	public String Status;

	public CaseHistory2ChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2ChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseHistory2ChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
