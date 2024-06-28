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
public class CodeSetBundleChangeEvent extends SObject {
	public static SObjectType$<CodeSetBundleChangeEvent> SObjectType;
	public static SObjectFields$<CodeSetBundleChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CodeSet10Id;
	public CodeSet CodeSet10;
	public Id CodeSet11Id;
	public CodeSet CodeSet11;
	public Id CodeSet12Id;
	public CodeSet CodeSet12;
	public Id CodeSet13Id;
	public CodeSet CodeSet13;
	public Id CodeSet14Id;
	public CodeSet CodeSet14;
	public Id CodeSet15Id;
	public CodeSet CodeSet15;
	public Id CodeSet1Id;
	public CodeSet CodeSet1;
	public Id CodeSet2Id;
	public CodeSet CodeSet2;
	public Id CodeSet3Id;
	public CodeSet CodeSet3;
	public Id CodeSet4Id;
	public CodeSet CodeSet4;
	public Id CodeSet5Id;
	public CodeSet CodeSet5;
	public Id CodeSet6Id;
	public CodeSet CodeSet6;
	public Id CodeSet7Id;
	public CodeSet CodeSet7;
	public Id CodeSet8Id;
	public CodeSet CodeSet8;
	public Id CodeSet9Id;
	public CodeSet CodeSet9;
	public String CodeSetBundleKey;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String Type;

	public CodeSetBundleChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundleChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CodeSetBundleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
