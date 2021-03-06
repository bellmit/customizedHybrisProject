/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import * as angular from 'angular';

export interface IReflectable<T> {

	setMethod?(name: string, methodInstance: (...params: any[]) => (angular.IPromise<void | T> | angular.IPromise<T[]>)): void;
	getMethodForVoid?(name: string): (...params: any[]) => angular.IPromise<void>;
	getMethodForSingleInstance?(name: string): (...params: any[]) => angular.IPromise<T>;
	getMethodForArray?(name: string): (...params: any[]) => angular.IPromise<T[]>;

}