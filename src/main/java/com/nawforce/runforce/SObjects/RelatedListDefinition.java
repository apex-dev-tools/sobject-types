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
public class RelatedListDefinition extends SObject {
	public static SObjectType$<RelatedListDefinition> SObjectType;
	public static SObjectFields$<RelatedListDefinition> Fields;

	public String DefaultSort;
	public String DurableId;
	public String EntityDefinitionId;
	public Id Id;
	public Boolean IsCustomizable;
	public Boolean IsDescribable;
	public Boolean IsLayoutable;
	public String Label;
	public String ParentEntityDefinitionId;
	public String RelatedListId;
	public String RelatedListName;

	public RelatedListColumnDefinition[] RelatedListColumnDefinitions;

	public RelatedListDefinition clone$() {throw new UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
