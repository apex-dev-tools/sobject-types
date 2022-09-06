/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ObjectTerritory2Association extends SObject {
	public static SObjectFields$<ObjectTerritory2Association> Fields;

	public String AssociationCause;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ObjectId;
	public Name Object;
	public String SobjectType;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ObjectTerritory2Association clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2Association clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
