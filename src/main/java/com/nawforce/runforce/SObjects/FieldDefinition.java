/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FieldDefinition extends SObject {
	public static SObjectType$<FieldDefinition> SObjectType;
	public static SObjectFields$<FieldDefinition> Fields;

	public Id BusinessOwnerId;
	public Name BusinessOwner;
	public String BusinessStatus;
	public String ComplianceGroup;
	public String ControllingFieldDefinitionId;
	public String DataType;
	public String Description;
	public String DeveloperName;
	public String DurableId;
	public String EntityDefinitionId;
	public String ExtraTypeInfo;
	public Id Id;
	public Boolean IsAiPredictionField;
	public Boolean IsApiFilterable;
	public Boolean IsApiGroupable;
	public Boolean IsApiSortable;
	public Boolean IsCalculated;
	public Boolean IsCompactLayoutable;
	public Boolean IsCompound;
	public Boolean IsFieldHistoryTracked;
	public Boolean IsHighScaleNumber;
	public Boolean IsHtmlFormatted;
	public Boolean IsIndexed;
	public Boolean IsListFilterable;
	public Boolean IsListSortable;
	public Boolean IsListVisible;
	public Boolean IsNameField;
	public Boolean IsNillable;
	public Boolean IsPolymorphicForeignKey;
	public Boolean IsSearchPrefilterable;
	public Boolean IsWorkflowFilterable;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer Length;
	public String MasterLabel;
	public String NamespacePrefix;
	public Integer Precision;
	public String PublisherId;
	public String QualifiedApiName;
	public String ReferenceTargetField;
	public Object ReferenceTo;
	public String RelationshipName;
	public String RunningUserFieldAccessId;
	public Integer Scale;
	public String SecurityClassification;
	public String ServiceDataTypeId;
	public String ValueTypeId;

	public FieldDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
