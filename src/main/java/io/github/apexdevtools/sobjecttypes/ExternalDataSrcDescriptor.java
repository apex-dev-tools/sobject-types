/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ExternalDataSrcDescriptor extends SObject {
	public static SObjectType$<ExternalDataSrcDescriptor> SObjectType;
	public static SObjectFields$<ExternalDataSrcDescriptor> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DescriptorVersion;
	public String DeveloperName;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Subtype;
	public Datetime SystemModstamp;
	public Integer SystemVersion;
	public String Type;

	public ExternalDataSrcDescriptor clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSrcDescriptor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
