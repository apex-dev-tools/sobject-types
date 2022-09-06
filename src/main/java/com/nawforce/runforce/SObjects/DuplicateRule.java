/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DuplicateRule extends SObject {
	public static SObjectFields$<DuplicateRule> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastViewedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String SobjectSubtype;
	public String SobjectType;
	public Datetime SystemModstamp;

	public DuplicateRecordSet[] DuplicateRecordSets;

	public DuplicateRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public DuplicateRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
