/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SearchLayout extends SObject {
	public static SObjectType$<SearchLayout> SObjectType;
	public static SObjectFields$<SearchLayout> Fields;

	public Object ButtonsDisplayed;
	public String DurableId;
	public String EntityDefinitionId;
	public Object FieldsDisplayed;
	public Id Id;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LayoutType;
	public String ListLayout;
	public String Profile;
	public String ProfileName;

	public SearchLayout clone$() {throw new java.lang.UnsupportedOperationException();}
	public SearchLayout clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SearchLayout clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SearchLayout clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SearchLayout clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
