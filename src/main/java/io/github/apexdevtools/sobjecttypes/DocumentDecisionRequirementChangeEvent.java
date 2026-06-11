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
public class DocumentDecisionRequirementChangeEvent extends SObject {
	public static SObjectType$<DocumentDecisionRequirementChangeEvent> SObjectType;
	public static SObjectFields$<DocumentDecisionRequirementChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DocumentReferenceObjectId;
	public DocumentCategory DocumentReferenceObject;
	public String HelpText;
	public Id Id;
	public Boolean IsUploadRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;

	public DocumentDecisionRequirementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentDecisionRequirementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentDecisionRequirementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentDecisionRequirementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentDecisionRequirementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
