/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GenericAssessmentTask extends SObject {
	public static SObjectType$<GenericAssessmentTask> SObjectType;
	public static SObjectFields$<GenericAssessmentTask> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DefinitionReferenceId;
	public GenericAssessmentTask DefinitionReference;
	public String Description;
	public Datetime EndDateTime;
	public Id GenericTaskRelationId;
	public Name GenericTaskRelation;
	public Id Id;
	public String ImplementorType;
	public Boolean IsDefinition;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer Sequence;
	public Datetime StartDateTime;
	public String Status;
	public String StatusCode;
	public Datetime SystemModstamp;

	public GenericAssessmentTask clone$() {throw new java.lang.UnsupportedOperationException();}
	public GenericAssessmentTask clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GenericAssessmentTask clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GenericAssessmentTask clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GenericAssessmentTask clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
