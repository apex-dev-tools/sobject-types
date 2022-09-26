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
public class RelationshipInfo extends SObject {
	public static SObjectType$<RelationshipInfo> SObjectType;
	public static SObjectFields$<RelationshipInfo> Fields;

	public String ChildSobjectId;
	public String DurableId;
	public String FieldId;
	public Id Id;
	public Boolean IsCascadeDelete;
	public Boolean IsDeprecatedAndHidden;
	public Boolean IsRestrictedDelete;
	public Object JunctionIdListNames;

	public RelationshipDomain[] RelationshipDomains;

	public RelationshipInfo clone$() {throw new UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
