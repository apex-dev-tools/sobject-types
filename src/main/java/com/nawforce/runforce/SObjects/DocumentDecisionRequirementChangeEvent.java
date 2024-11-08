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
