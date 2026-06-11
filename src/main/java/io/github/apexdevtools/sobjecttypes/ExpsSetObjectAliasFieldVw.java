/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ExpsSetObjectAliasFieldVw extends SObject {
	public static SObjectType$<ExpsSetObjectAliasFieldVw> SObjectType;
	public static SObjectFields$<ExpsSetObjectAliasFieldVw> Fields;

	public String DurableId;
	public String ExpsSetDefVerVarField;
	public String FieldAlias;
	public Id Id;
	public String InstalledPackageName;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ManageableState;
	public String NamespacePrefix;
	public String ObjectAlias;
	public String ObjectApiName;
	public String SourceFieldDataType;
	public Integer SourceFieldDecimalScale;
	public String SourceFieldName;
	public String UsageType;

	public ExpsSetObjectAliasFieldVw clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExpsSetObjectAliasFieldVw clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
