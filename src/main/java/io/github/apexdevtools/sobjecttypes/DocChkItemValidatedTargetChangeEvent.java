/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DocChkItemValidatedTargetChangeEvent extends SObject {
	public static SObjectType$<DocChkItemValidatedTargetChangeEvent> SObjectType;
	public static SObjectFields$<DocChkItemValidatedTargetChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DocumentChecklistItemId;
	public DocumentChecklistItem DocumentChecklistItem;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Id TargetReferenceObjectId;
	public SObject TargetReferenceObject;

	public DocChkItemValidatedTargetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocChkItemValidatedTargetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocChkItemValidatedTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocChkItemValidatedTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocChkItemValidatedTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
