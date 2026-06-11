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
public class BatchCalcJobDefinition extends SObject {
	public static SObjectType$<BatchCalcJobDefinition> SObjectType;
	public static SObjectFields$<BatchCalcJobDefinition> Fields;

	public Id BatchJobDefinitionId;
	public BatchJobDefinition BatchJobDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyConversion;
	public String DataSpaceApiName;
	public String DefinitionRunMode;
	public String DeveloperName;
	public Boolean DoesGenAllFailedRecords;
	public String ExecutionPlatformObjectType;
	public String ExecutionPlatformType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsTemplate;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String ProcessType;
	public Datetime SystemModstamp;
	public String TargetCurrencyIsoCode;

	public BatchCalcJobDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchCalcJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
