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
public class OmniDataTransformItem extends SObject {
	public static SObjectType$<OmniDataTransformItem> SObjectType;
	public static SObjectFields$<OmniDataTransformItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultValue;
	public String FilterDataType;
	public Decimal FilterGroup;
	public String FilterOperator;
	public String FilterValue;
	public String FormulaConverted;
	public String FormulaExpression;
	public String FormulaResultPath;
	public Decimal FormulaSequence;
	public String GlobalKey;
	public Id Id;
	public String InputFieldName;
	public String InputObjectName;
	public Decimal InputObjectQuerySequence;
	public Boolean IsDeleted;
	public Boolean IsDisabled;
	public Boolean IsRequiredForUpsert;
	public Boolean IsUpsertKey;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LinkedFieldName;
	public Decimal LinkedObjectSequence;
	public String LookupByFieldName;
	public String LookupObjectName;
	public String LookupReturnedFieldName;
	public String MigrationAttribute;
	public String MigrationCategory;
	public String MigrationGroup;
	public String MigrationKey;
	public String MigrationPattern;
	public String MigrationProcess;
	public String MigrationType;
	public String MigrationValue;
	public String Name;
	public Id OmniDataTransformationId;
	public OmniDataTransform OmniDataTransformation;
	public Decimal OutputCreationSequence;
	public String OutputFieldFormat;
	public String OutputFieldName;
	public String OutputObjectName;
	public Datetime SystemModstamp;
	public String TransformValueMappings;

	public OmniDataTransformItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransformItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransformItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransformItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransformItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
