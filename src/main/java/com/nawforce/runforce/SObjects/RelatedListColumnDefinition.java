/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class RelatedListColumnDefinition extends SObject {
	public static SObjectType$<RelatedListColumnDefinition> SObjectType;
	public static SObjectFields$<RelatedListColumnDefinition> Fields;

	public String Alias;
	public String ColumnSoql;
	public String DurableId;
	public String FieldDefinitionId;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDescribable;
	public String Label;
	public String LookupId;
	public String RelatedListDefinitionId;

	public RelatedListColumnDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
