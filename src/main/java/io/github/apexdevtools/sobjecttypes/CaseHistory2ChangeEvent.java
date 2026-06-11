/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
