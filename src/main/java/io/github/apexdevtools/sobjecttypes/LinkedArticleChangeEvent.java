/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LinkedArticleChangeEvent extends SObject {
	public static SObjectType$<LinkedArticleChangeEvent> SObjectType;
	public static SObjectFields$<LinkedArticleChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id KnowledgeArticleId;
	public Id KnowledgeArticleVersionId;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LinkedEntityId;
	public SObject LinkedEntity;
	public String Name;
	public String ReplayId;
	public String Type;

	public LinkedArticleChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LinkedArticleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
